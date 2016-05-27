package calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalculatorUI extends JFrame {
  private Map<String, JButton> buttons = new HashMap<>();
  private CalculatorMediator mediator;
  private KeyAdapter keyListener = new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
      String key = "" + e.getKeyChar();
      if (!buttons.containsKey(key)) {
        if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER || e.getKeyChar() == '\n'){
          key = "=";
        } else if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
          key = "AC";
        } else if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
          key = "C";
        } else {
          return;
        }
      }
      buttons.get(key).doClick();
    }
  };
  
  public CalculatorUI(CalculatorMediator mediator) {
    super("Calculator");
    this.mediator = mediator;
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setSize(400,  1600);
    addComponents(getContentPane());

    pack();
  }
  
  private void addComponents(Container pane) {
    pane.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.BOTH;

    gbc.weightx = 0.0;
    gbc.weighty = 0.4;
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 4;
    JLabel display = new JLabel("0");
    mediator.setDisplay(display);
    display.setBorder(new EmptyBorder(0, 10, 0, 10));
    display.setBackground(Color.CYAN);
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    pane.add(display, gbc);
    
    
    Digit[] digits = new Digit[] { 
        Digit.SEVEN, Digit.EIGHT, Digit.NINE, 
        Digit.FOUR, Digit.FIVE, Digit.SIX, 
        Digit.ONE, Digit.TWO, Digit.THREE
    };
  
    gbc.weightx = 0.5;
    gbc.gridwidth = 1;
    for (int i = 0; i < digits.length; ++i) {
      gbc.gridy = 2 + i / 3;
      gbc.gridx = i % 3;
      addButton(digits[i], gbc, pane);
    }
    gbc.gridx = 0;
    ++gbc.gridy;
    gbc.gridwidth = 2;
    addButton(Digit.ZERO, gbc, pane);
    gbc.gridx = 2;
    gbc.gridwidth = 1;
    addButton(Digit.POINT, gbc, pane);
    
    Operator[] ops = new Operator[] { 
        Operator.DIVIDE, Operator.TIMES, Operator.MINUS, Operator.PLUS, 
        Operator.EQUALS
    };
    gbc.gridx = 3;
    gbc.gridy = 1;
    for (Operator op : ops) {
      addButton(op, gbc, pane);
      ++gbc.gridy;
    }
    
    gbc.gridx = 0;
    gbc.gridy = 1;
    addButton(Clear.ALL_CLEAR, gbc, pane);
    ++gbc.gridx;
    addButton(Clear.CLEAR, gbc, pane);
    ++gbc.gridx;
    addButton(Character.PERCENT, gbc, pane);
    
    pane.addKeyListener(keyListener);
  }
  
  private JButton getButton(Token token, GridBagConstraints gbc, Container pane) {
    JButton b = new JButton(token.getDisplayValue());
    buttons.put(token.getDisplayValue(), b);
    b.setActionCommand(token.getDisplayValue());
    b.addKeyListener(keyListener);
    pane.add(b, gbc);
    return b;
  }

  private void addButton(final Digit digit, GridBagConstraints gbc, Container pane) {
    getButton(digit, gbc, pane).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        mediator.digitPressed(digit);
      }
    });
  }

  private void addButton(final Operator operator, GridBagConstraints gbc, Container pane) {
    getButton(operator, gbc, pane).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        mediator.operatorPressed(operator);
      }
    });
  }

  private void addButton(final Clear clear, GridBagConstraints gbc, Container pane) {
    getButton(clear, gbc, pane).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        mediator.clearPressed(clear);
      }
    });
  }

  private void addButton(final Character character, GridBagConstraints gbc, Container pane) {
    getButton(character, gbc, pane).addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        mediator.characterPressed(character);
      }
    });
  }
}

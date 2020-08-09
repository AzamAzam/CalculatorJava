//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class cal extends JFrame implements ActionListener {
//    Container c;
//    //Declare Buttons and textfield
//    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bClear, bMul, bMinus, bPlus, bPoint, bEqual, bDiv, bSqrt, bRem, bAdditive;
//    JTextField oldScreen;
//    JTextField newScreen;
//    // to store values and operators
//    double operand1, operand2;
//    char operator;
//    int COUNT = 0;
//    String currentValue = "";
//
//    // Constructor
//    cal() {
//        initCalc();
//    }
//
//    // Main function
//    public static void main(String[] args) {
//        cal myCalculator = new cal();
//    }
//
//    public void initCalc() {
//        c = getContentPane();
//        // Text Field for answer
//        oldScreen = new JTextField();
//        newScreen = new JTextField();
//        JPanel screenPanel = new JPanel(new GridLayout(2, 1));
//        screenPanel.add(newScreen);
//        screenPanel.add(oldScreen);
//        oldScreen.setHorizontalAlignment(JTextField.RIGHT);
//        newScreen.setHorizontalAlignment(JTextField.RIGHT);
//        // Initialize buttons
//        b1 = new JButton("1");
//        b1.addActionListener(this);
//        b2 = new JButton("2");
//        b2.addActionListener(this);
//        b3 = new JButton("3");
//        b3.addActionListener(this);
//        bClear = new JButton("C");
//        bClear.addActionListener(this);
//        b4 = new JButton("4");
//        b4.addActionListener(this);
//        b5 = new JButton("5");
//        b5.addActionListener(this);
//        b6 = new JButton("6");
//        b6.addActionListener(this);
//        bMul = new JButton("*");
//        bMul.addActionListener(this);
//        b7 = new JButton("7");
//        b7.addActionListener(this);
//        b8 = new JButton("8");
//        b8.addActionListener(this);
//        b9 = new JButton("9");
//        b9.addActionListener(this);
//        bMinus = new JButton("-");
//        bMinus.addActionListener(this);
//        b0 = new JButton("0");
//        b0.addActionListener(this);
//        bPoint = new JButton(".");
//        bPoint.addActionListener(this);
//        bPlus = new JButton("+");
//        bPlus.addActionListener(this);
//        bEqual = new JButton("=");
//        bEqual.addActionListener(this);
//        bDiv = new JButton("/");
//        bDiv.addActionListener(this);
//        bSqrt = new JButton("\u221A");
//        bSqrt.addActionListener(this);
//        bRem = new JButton("%");
//        bRem.addActionListener(this);
//        bAdditive = new JButton("\u00B1");
//        bAdditive.addActionListener(this);
//        // Lable to display My Calculator
//        JLabel calcDisplay = new JLabel("My Calculator");
//        // Creating Panel for all buttons
//        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
//        // Adding line 1 buttons to panel
//        buttonPanel.add(bRem);
//        buttonPanel.add(bSqrt);
//        buttonPanel.add(bClear);
//        buttonPanel.add(bDiv);
//        // Adding line 2 buttons to panel
//        buttonPanel.add(b7);
//        buttonPanel.add(b8);
//        buttonPanel.add(b9);
//        buttonPanel.add(bMul);
//        // Adding line 3 buttons to panel
//        buttonPanel.add(b4);
//        buttonPanel.add(b5);
//        buttonPanel.add(b6);
//        buttonPanel.add(bMinus);
//        // Adding line 4 buttons to panel
//        buttonPanel.add(b1);
//        buttonPanel.add(b2);
//        buttonPanel.add(b3);
//        buttonPanel.add(bPlus);
//        // Adding line 5 buttons to panel
//        buttonPanel.add(bAdditive);
//        buttonPanel.add(b0);
//        buttonPanel.add(bPoint);
//        buttonPanel.add(bEqual);
//        // Now setting Frame Layout
//        c.setLayout(new BorderLayout());
//        // Adding all components in Container
//        c.add(screenPanel, BorderLayout.NORTH);
//        c.add(buttonPanel, BorderLayout.CENTER);
//        c.add(calcDisplay, BorderLayout.SOUTH);
//        // set size and visibility
//        setSize(300, 300);
//        setVisible(true);
//        // Set Close Operation
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        // setting Title
//        setTitle("Calculator");
//        newScreen.setEditable(false); //No Input from keyboard
//        oldScreen.setEditable(false);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        char button = e.getActionCommand().charAt(0);
//        if ((COUNT == 0) && ((button >= '0' && button <= '9') || (button == '.')) && (button != '=')) {
//            System.out.println(button);
//            oldScreen.setText(oldScreen.getText() + e.getActionCommand().toString());
//            currentValue = oldScreen.getText();
//        } else {
//            if ((COUNT > 0) && ((button >= 48 && button <= 57) || (button == '.'))) {
//                System.out.println("2");
//                oldScreen.setText(oldScreen.getText() + e.getActionCommand().toString());
//                currentValue = oldScreen.getText();
//            } else {
//                if (COUNT > 0 && (button == '+' || button == '-' || button == '/' || button == '*' || button == '\u00B1' || button == '\u221A')) {
//                    System.out.println("3");
//                    oldScreen.setText(oldScreen.getText() + e.getActionCommand().toString());
//                    currentValue = newScreen.getText();
//                }
//                String x = "";
//                switch (button) {
//                    case '-':
//                        newScreen.setText(currentValue + e.getActionCommand().toString());
//                        operator = '-';
//                        x = currentValue;
//                        if (x != null)
//                            operand1 = Double.parseDouble(x);
//                        break;
//                    case '+':
//                        newScreen.setText(currentValue + e.getActionCommand().toString());
//                        operator = '+';
//                        x = currentValue;
//                        if (x != null)
//                            operand1 = Double.parseDouble(x);
//                        break;
//                    case '*':
//                        newScreen.setText(currentValue + e.getActionCommand().toString());
//                        operator = '*';
//                        x = currentValue;
//                        if (x != null)
//                            operand1 = Double.parseDouble(x);
//                        break;
//                    case '/':
//                        newScreen.setText(currentValue + e.getActionCommand().toString());
//                        operator = '/';
//                        x = currentValue;
//                        if (x != null)
//                            operand1 = Double.parseDouble(x);
//                        break;
//                    case '%':
//                        newScreen.setText(currentValue + e.getActionCommand().toString());
//                        operator = '%';
//                        x = currentValue;
//                        if (x != null)
//                            operand1 = Double.parseDouble(x);
//                        break;
//                    case '\u221A':
//                        newScreen.setText(currentValue + e.getActionCommand().toString());
//                        operator = '\u221A';
//                        x = currentValue;
//                        if (x != null)
//                            operand1 = Double.parseDouble(x);
//                        operand2 = 0;
//                        calculateAnswer(false);
//                        break;
//                    case '\u00B1':
//                        newScreen.setText(currentValue + e.getActionCommand().toString());
//                        operator = '\u00B1';
//                        x = currentValue;
//                        if (x != null)
//                            operand1 = Double.parseDouble(x);
//                        operand2 = 0;
//                        calculateAnswer(false);
//                        break;
//                    case '=':
//                        //System.out.println(newScreen);
//                        x = currentValue;
//                        if (x != null)
//                            operand2 = Double.parseDouble(x);
//                        else
//                            operand2 = operand1;
//                        System.out.println(operand1 + "  " + operator + "  " + operand2);
//                        calculateAnswer(true);
//                        break;
//                    case 'C': //C pressed
//                        oldScreen.setText("");
//                        newScreen.setText("");
//                        operand1 = operand2 = 0;
//                        operator = ' ';
//                    default:
//                        oldScreen.setText("");
//                        newScreen.setText("");
//                }
//            }
//        }
//        //  oldScreen.setText("");
//    }
//
//    public void calculateAnswer(boolean flag) {
//        COUNT = COUNT + 1;
//        double answer = 0;
//        try {
//            if (!flag) {
//                answer = operand1;
//                if (operator == '\u00B1')
//                    answer = -answer;
//                if (operator == '\u221A')
//                    answer = Math.sqrt(answer);
//                operand1 = answer;
//                newScreen.setText(Double.toString(answer));
//            } else {
//                answer = operand1;
//                switch (operator) {
//                    case '+':
//                        answer += operand2;
//                        break;
//                    case '-':
//                        answer -= operand2;
//                        break;
//                    case '*':
//                        answer *= operand2;
//                        break;
//                    case '/':
//                        try {
//                            answer /= operand2;
//                        } catch (Exception e) {
//                            newScreen.setText("Error: Result is undefined");
//                            oldScreen.setText("");
//                        }
//                        break;
//                    case '%':
//                        answer = (int) answer % (int) operand2;
//                        break;
//                    default:
//                        newScreen.setText("Error");
//                        oldScreen.setText("");
//                }
//                operand1 = answer;
//            }
//            newScreen.setText(Double.toString(answer));
//        } catch (Exception e5) {
//            newScreen.setText("Error in calculating answer");
//            //e5.printStackTrace();
//        }
//        System.out.println(answer);
//    }
//}

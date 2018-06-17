/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends JFrame implements ActionListener {
    JFrame  guiFrame;
    JPanel textAreaPanel;
    JPanel buttonPanel;
    JTextField inputArea,upperArea;
    JButton inputButtons[];
    String buttonstext[];
    String  screen,input,temproryOperand;
    char operator ;

    boolean isoperator,isClearOperator,isfirstchar;
    double operand1,operand2;

    void  resetvariables(){
        screen=input=temproryOperand="";
        isoperator=false;
        isClearOperator=false;
        operand1=operand2=0;
        operator=' ';
        isfirstchar=true;
    }

    public Calculator(){

        guiFrame=new JFrame();  //border  layout  default
        buttonPanel=new JPanel();
        textAreaPanel=new JPanel();

        inputArea=new JTextField();
        upperArea=new JTextField();


        upperArea.setHorizontalAlignment(SwingConstants.RIGHT);
        upperArea.setEditable(false);
        inputArea.setHorizontalAlignment(SwingConstants.RIGHT);
        inputArea.setEditable(false);

        String  btns[]= {"CE","C","\u221A","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
        buttonstext=btns;
        inputButtons=new JButton[20];


        //function  create GUI  layout  and  set  it
        createGUI();

        guiFrame.setVisible(true);

        resetvariables();
    }
    void  createGUI(){
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("My Calculator");
        guiFrame.add(textAreaPanel, BorderLayout.NORTH);
        guiFrame.add(buttonPanel,BorderLayout.CENTER);
        guiFrame.setSize(new Dimension(300,400));

        textAreaPanel.setLayout(new BorderLayout());
        textAreaPanel.add(upperArea,BorderLayout.NORTH);
        textAreaPanel.add(inputArea,BorderLayout.CENTER);

        upperArea.setFont(new Font("Segoe UI", Font.BOLD,24));
        inputArea.setFont(new Font("Segoe UI", Font.BOLD,24));
        buttonPanel.setLayout(new GridLayout(5,4,2,2));

        createButtons();
    }
    void  createButtons(){


        for  (int  i=0;i<20;i++){
            inputButtons[i]=new JButton(buttonstext[i]);
            inputButtons[i].setFont(new Font("Segoe UI", Font.BOLD,24));
            inputButtons[i].setBackground(Color.DARK_GRAY);
            inputButtons[i].setFocusPainted(false);
            inputButtons[i].setForeground(Color.WHITE);

            inputButtons[i].addActionListener(this);

            buttonPanel.add(inputButtons[i]);

        }
        inputButtons[0].setBackground(Color.LIGHT_GRAY);
        inputButtons[1].setBackground(Color.lightGray);
        inputButtons[2].setBackground(Color.GRAY);
        inputButtons[3].setBackground(Color.GRAY);
        inputButtons[7].setBackground(Color.GRAY);
        inputButtons[11].setBackground(Color.GRAY);
        inputButtons[15].setBackground(Color.GRAY);
        inputButtons[18].setBackground(Color.GRAY);
        inputButtons[19].setBackground(Color.GRAY);

    }
    public  void actionPerformed(ActionEvent event){

        String in=event.getActionCommand();

        if (isfirstchar && in.equals("-"))
        {
            input=in;
            temproryOperand=in;

        }
        else if (in.equals("+")||in.equals("-")||in.equals("*")||in.equals("/")||in.equals("%"))
        {
            if ( !isfirstchar) { //set  operand 1
                if (temproryOperand != "") {
                    operand1 = Double.parseDouble(temproryOperand);

                } else {
                    operand1 = 0;
                    screen = "0";
                }

                input = "";
                screen = temproryOperand + in;
                isoperator = true;
                isClearOperator = false;
                operator = in.charAt(0);
            }
            else   if (in.equals("+")){
                input=in;
                temproryOperand=in;
            }


        }
        else if (in.equals("=")) {
            if (operator!=' '){
                if (temproryOperand != ""&&!isClearOperator && !isfirstchar)
                {
                    operand2 = Double.parseDouble(temproryOperand);
                    screen += temproryOperand;
                }
                else if(!isoperator) {
                    screen = input+operator +""+ operand2;
                }
                else  if  (isClearOperator){
                    // screen += operator+""+ operand2;
                    screen = input+operator +""+ operand2;
                }
                else
                    screen +=  operand2;

                input = calculate();
                operand1=Double.parseDouble(input);
                isClearOperator = true;
                temproryOperand=input;
            }
        }
        else if (in.equals("C")){
            resetvariables();
        }
        else if (in.equals("CE")){
            input= "";
            temproryOperand="";
        }
        else  if (in.equals("\u221A")){
            if (temproryOperand!=""&&!isfirstchar) {
                operand1 = Double.parseDouble(input);
            }
            input=""+Math.sqrt(operand1);
            screen =in+temproryOperand;
            operand2=0;
            operator=' ';
            isClearOperator=true;

        }  //new  operand  clear 2nd
        else
        {
            if (isClearOperator){
                screen="";
                input=in;
                isClearOperator=false;
                temproryOperand=in;
                operand1=operand2=0;
                operator=' ';
                isfirstchar=false;
            }
            else if  (!isoperator  ) {
                input += in;
                temproryOperand=input;
                isClearOperator=false;
                isfirstchar=false;
            }

            else {
                temproryOperand=input = in;
                //    screen+=in;
                operand2=0;
                isoperator=false;
                isClearOperator=false;
                isfirstchar=false;
            }

        }

        upperArea.setText(screen);
        inputArea.setText(input );
    }
    String  calculate (){
        switch (operator) {
            case '+':
                return "" +(operand1+operand2);
            case '-':
                return "" +(operand1-operand2);
            case '*':
                return "" +(operand1*operand2);
            case '/':
                try {
                    return "" +(operand1/operand2);
                }
                catch (ArithmeticException e){
                    input=e+"";
                }
            case '%':
                return ""+ ((int) operand1)%((int)operand2);
        }
        return "";
    }
}
*/


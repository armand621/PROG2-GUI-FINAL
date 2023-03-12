/*-------------------------------------------------------
|                  SALARY CALCULATOR GUI   		  	    |
|    												    |
|         Programmer: Armand Robin I. Tangonan 		    |
|                        BSIT 1A 						|
|													    |
|	Note: Do not remove\modify the static method for    |
|		  JTextField and JLabel for the program to      |
|         run properly without any error(s)/problem(s)  |
|													    |
|                                                       |
-------------------------------------------------------*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{

	//Declaring JFamily methods with global scope

		static JTextField emId, emName, inputDes, inputWh, inputRate, inputOt, inputOtPay;
		JButton buttonClear, buttonCompute;
		static JLabel resEmIdOut, resEmNameOut, resDesignationOut, resWorkHourOut, resRateOut, resOtOut, resGrossPayOut, resSssOut, resPhOut, resPiOut, resTaxOut, resTotalDeducOut, resNetpayOut;

	
	//Making the constructor method for JFrame

	  Frame(){
		
		JFrame frame = new JFrame("Salary Calculator");

		//ImageIcon
		ImageIcon icon = new ImageIcon("icon.png");
		
		//label for details
		JLabel emDetails = new JLabel();
		JLabel emSalary = new JLabel();
		JLabel label = new JLabel();
		JLabel labelEmId = new JLabel();
		JLabel labelEmName = new JLabel();
		JLabel labelDesignation = new JLabel();
		
		JLabel labelworkhour = new JLabel();
		JLabel labelrate = new JLabel();
		JLabel labelot = new JLabel();
		JLabel labelotPay = new JLabel();

		JLabel resEmId = new JLabel();
		JLabel resEmName = new JLabel();
		JLabel resDesignation = new JLabel();
		JLabel resWorkHour = new JLabel();
		JLabel resRate = new JLabel();
		JLabel resOt = new JLabel();
		JLabel resGrossPay = new JLabel();

		JLabel resDeduction = new JLabel();
		JLabel resSss = new JLabel();
		JLabel resPh = new JLabel();
		JLabel resPi = new JLabel();
		JLabel resTax = new JLabel();
		JLabel resTotalDeduc = new JLabel();
		JLabel resNetpay = new JLabel();

		
		//declared as static global methods for printing of outputs
		 resEmIdOut = new JLabel();
		 resEmNameOut = new JLabel();
		 resDesignationOut = new JLabel();
		 resWorkHourOut = new JLabel();
		 resRateOut = new JLabel();
		 resOtOut = new JLabel();
		 resGrossPayOut = new JLabel();

		 resSssOut = new JLabel();
		 resPhOut = new JLabel();
		 resPiOut = new JLabel();
		 resTaxOut = new JLabel();
		 resTotalDeducOut = new JLabel();
		 resNetpayOut = new JLabel();
		

		//declared as static global methods for getting the inputs
		 emId = new JTextField();
		 emName = new JTextField();
		 inputDes = new JTextField();
		
		 inputWh = new JTextField();
		 inputRate = new JTextField();
		 inputOt = new JTextField();
		 inputOtPay = new JTextField();
		
		
		//buttons for different functions
		 buttonClear = new JButton();
		 buttonCompute = new JButton();
		

		//toolkits 
		Toolkit toolkit = frame.getToolkit();
		Dimension size = toolkit.getScreenSize();
		

		//frame set-up
		frame.setSize(1000,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation((size.width/2 - (frame.getWidth()/2)), (size.height/2 - (frame.getHeight()/2)));
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(0xFFFFFF));

	
		//setting image icon
		frame.setIconImage(icon.getImage());


		//Main label 
		label.setText("EMPLOYEE SALARY");
		label.setForeground(Color.WHITE);
		label.setBounds(0,0,1000,40);
		label.setFont(new Font("Calibri", Font.BOLD,30));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBackground(new Color(0x3C3CC4));
		label.setOpaque(true);
		

		//Employee Details Label
		emDetails.setText("EMPLOYEE DETAILS");
		emDetails.setForeground(new Color(0xFFFFFF));
		emDetails.setFont(new Font("Calibri", Font.BOLD,30));
		emDetails.setBounds(-20,40,520,50);
		emDetails.setHorizontalAlignment(JLabel.CENTER);
		emDetails.setBackground(new Color(0x0000FF));
		emDetails.setOpaque(true);

		//Salary Details Label
		emSalary.setText("SALARY DETAILS");
		emSalary.setForeground(new Color(0xFFFFFF));
		emSalary.setFont(new Font("Calibri", Font.BOLD,30));
		emSalary.setBounds(480,40,530,50);
		emSalary.setHorizontalAlignment(JLabel.CENTER);
		emSalary.setBackground(new Color(0x0000FF));
		emSalary.setOpaque(true);

		
		

		/*--------------------------------------------
		|           Labels for Informations          |
		--------------------------------------------*/

		//label for employee ID
		labelEmId.setText("Employee ID:");
		labelEmId.setForeground(new Color(0x0000A0));
		labelEmId.setFont(new Font("Calibri", Font.BOLD,20));
		labelEmId.setBounds(20,100,500,60);
		
		//label for employee name
		labelEmName.setText("Employee Name:");
		labelEmName.setForeground(new Color(0x0000A0));
		labelEmName.setFont(new Font("Calibri", Font.BOLD,20));
		labelEmName.setBounds(20,150,500,60);
		
		
		//label for designation
		labelDesignation.setText("Designation:");
		labelDesignation.setForeground(new Color(0x0000A0));
		labelDesignation.setFont(new Font("Calibri", Font.BOLD,20));
		labelDesignation.setBounds(20,200,500,60);
		

		//label for working hours
		labelworkhour.setText("Working Hours:");
		labelworkhour.setForeground(new Color(0x0000A0));
		labelworkhour.setFont(new Font("Calibri", Font.BOLD,20));
		labelworkhour.setBounds(20,245,500,60);


		//label for rate or pay per hour
		labelrate.setText("Rate:");
		labelrate.setForeground(new Color(0x0000A0));
		labelrate.setFont(new Font("Calibri", Font.BOLD,20));
		labelrate.setBounds(20,295,500,60);
		

		//label for overtime
		labelot.setText("Overtime:");
		labelot.setForeground(new Color(0x0000A0));
		labelot.setFont(new Font("Calibri", Font.BOLD,20));
		labelot.setBounds(20,340,500,60);


		//label for overtime rate/pay
		labelotPay.setText("Overtime Rate:");
		labelotPay.setForeground(new Color(0x0000A0));
		labelotPay.setFont(new Font("Calibri", Font.BOLD,20));
		labelotPay.setBounds(20,387,500,60);
		


		/*--------------------------------------------
		|               TextField Inputs             |
		--------------------------------------------*/

		//textfield input for employee ID
		emId.setBounds(170,114,250,30);
		emId.setFont(new Font("Calibri", Font.BOLD,16));
		emId.setHorizontalAlignment(JTextField.CENTER);



		//textfield input for employee Name
		emName.setBounds(170,165,250,30);
		emName.setFont(new Font("Calibri", Font.BOLD,16));
		emName.setHorizontalAlignment(JTextField.CENTER);
		

		//textfield input for employee designation
		inputDes.setBounds(170,215,250,30);
		inputDes.setFont(new Font("Calibri", Font.BOLD,16));
		inputDes.setHorizontalAlignment(JTextField.CENTER);
		

		//textfield input (number type) for employee working hours
		inputWh.setBounds(170,261,250,30);
		inputWh.setFont(new Font("Calibri", Font.BOLD,16));
		inputWh.setHorizontalAlignment(JTextField.CENTER);
		

		//textfield input (number type) for employee rate/pay
		inputRate.setBounds(170,308,250,30);
		inputRate.setFont(new Font("Calibri", Font.BOLD,16));
		inputRate.setHorizontalAlignment(JTextField.CENTER);
		

		//textfield input (number type) for employee overtime hours
		inputOt.setBounds(170,355,250,30);
		inputOt.setFont(new Font("Calibri", Font.BOLD,16));
		inputOt.setHorizontalAlignment(JTextField.CENTER);


		//textfield input (number type) for employee overtime rate/pay
		inputOtPay.setBounds(170,403,250,30);
		inputOtPay.setFont(new Font("Calibri", Font.BOLD,16));
		inputOtPay.setHorizontalAlignment(JTextField.CENTER);
		
	
	

		/*--------------------------------------------
		|                 Buttons                    |
		--------------------------------------------*/

		//Button to clear the inputs and outputs

		buttonClear.setBackground(new Color(0x0000FF));
		buttonClear.setForeground(Color.WHITE);
		buttonClear.setFocusable(false);
		
		buttonClear.setText("Clear");
		buttonClear.setFont(new Font("Calibri", Font.BOLD,20));
		buttonClear.setBounds(170,465,120,40);
		buttonClear.addActionListener(this);



		//Button for Computation of Salary
		buttonCompute.setBackground(new Color(0x0000FF));
		buttonCompute.setForeground(Color.WHITE);
		buttonCompute.setFocusable(false);
		
		buttonCompute.setText("Compute");
		buttonCompute.setFont(new Font("Calibri", Font.BOLD,20));
		buttonCompute.setBounds(300,465,120,40);
		buttonCompute.addActionListener(this);

		
		

		/*--------------------------------------------
		|             Label for Results              |
		--------------------------------------------*/
		

		
		//Label for results of employee ID
		resEmId.setText("Employee ID: ");
		resEmId.setForeground(new Color(0x0000A0));
		resEmId.setFont(new Font("Calibri", Font.BOLD,20));
		resEmId.setBounds(550,90,500,60);
		

		
		//Label Results of employee Name
		resEmName.setText("Employee Name:");
		resEmName.setForeground(new Color(0x0000A0));
		resEmName.setFont(new Font("Calibri", Font.BOLD,20));
		resEmName.setBounds(550,120,500,60);
		

		
		
		//Label for results of employee designation
		resDesignation.setText("Designation:");
		resDesignation.setForeground(new Color(0x0000A0));
		resDesignation.setFont(new Font("Calibri", Font.BOLD,20));
		resDesignation.setBounds(550,150,500,60);
	

		
		//Label for results of employee work hour
		resWorkHour.setText("Working Hours:");
		resWorkHour.setForeground(new Color(0x0000A0));
		resWorkHour.setFont(new Font("Calibri", Font.BOLD,20));
		resWorkHour.setBounds(550,180,500,60);
	

		//Label for results of employee rate
		resRate.setText("Rate:");
		resRate.setForeground(new Color(0x0000A0));
		resRate.setFont(new Font("Calibri", Font.BOLD,20));
		resRate.setBounds(550,210,500,60);
		

		
		//Label for Results of employee over time
		resOt.setText("Overtime Hours:");
		resOt.setForeground(new Color(0x0000A0));
		resOt.setFont(new Font("Calibri", Font.BOLD,20));
		resOt.setBounds(550,240,500,60);
	
		
		//Label for results of employee gross pay
		resGrossPay.setText("Gross Pay:");
		resGrossPay.setForeground(new Color(0x0000A0));
		resGrossPay.setFont(new Font("Calibri", Font.BOLD,25));
		resGrossPay.setBounds(550,270,500,60);


		//Label for results of deductions
		resDeduction.setText("DEDUCTIONS:");
		resDeduction.setForeground(new Color(0x0000A0));
		resDeduction.setFont(new Font("Calibri", Font.BOLD,25));
		resDeduction.setBounds(550,310,500,60);

		//Label for result of deduction of SSS
		resSss.setText("SSS: ");
		resSss.setForeground(new Color(0x0000A0));
		resSss.setFont(new Font("Calibri", Font.BOLD,20));
		resSss.setBounds(600,338,500,60);
		

		
		//Label for Results of deduction of Philhealth
		resPh.setText("PhilHealth:");
		resPh.setForeground(new Color(0x0000A0));
		resPh.setFont(new Font("Calibri", Font.BOLD,20));
		resPh.setBounds(600,367,500,60);
		

		
		
		//Label for results of deduction of  pagibig
		resPi.setText("Pag-Ibig:");
		resPi.setForeground(new Color(0x0000A0));
		resPi.setFont(new Font("Calibri", Font.BOLD,20));
		resPi.setBounds(600,397,500,60);

		//Label for results of  deduction of  tax
		resTax.setText("Tax:");
		resTax.setForeground(new Color(0x0000A0));
		resTax.setFont(new Font("Calibri", Font.BOLD,20));
		resTax.setBounds(600,427,500,60);

		//Label for results of total deduction
		resTotalDeduc.setText("TOTAL DEDUCTIONS:");
		resTotalDeduc.setForeground(new Color(0x0000A0));
		resTotalDeduc.setFont(new Font("Calibri", Font.BOLD,20));
		resTotalDeduc.setBounds(550,457,500,60);

		//Label for result of Netpay
		resNetpay.setText("NETPAY:");
		resNetpay.setForeground(new Color(0x0000A0));
		resNetpay.setFont(new Font("Calibri", Font.BOLD,30));
		resNetpay.setBounds(582,497,500,60);




		/*--------------------------------------------
		|            COMPUTATION RESULTS             |
		--------------------------------------------*/

		//Results for employee ID
		resEmIdOut.setText("");
		resEmIdOut.setForeground(new Color(0x0000A0));
		resEmIdOut.setFont(new Font("Calibri", Font.BOLD,20));
		resEmIdOut.setBounds(740,90,500,60);
		
		
		//Results for employee Name
		resEmNameOut.setText("");
		resEmNameOut.setForeground(new Color(0x0000A0));
		resEmNameOut.setFont(new Font("Calibri", Font.BOLD,20));
		resEmNameOut.setBounds(740,120,500,60);
		

		//Results for employee designation
		resDesignationOut.setText("");
		resDesignationOut.setForeground(new Color(0x0000A0));
		resDesignationOut.setFont(new Font("Calibri", Font.BOLD,20));
		resDesignationOut.setBounds(740,150,500,60);

		
		//Results for employee work hour
		resWorkHourOut.setText("");
		resWorkHourOut.setForeground(new Color(0x0000A0));
		resWorkHourOut.setFont(new Font("Calibri", Font.BOLD,20));
		resWorkHourOut.setBounds(740,180,500,60);
	

		//Results for employee rate
		resRateOut.setText("");
		resRateOut.setForeground(new Color(0x0000A0));
		resRateOut.setFont(new Font("Calibri", Font.BOLD,20));
		resRateOut.setBounds(740,210,500,60);
		

		//Results for employee over time
		resOtOut.setText("");
		resOtOut.setForeground(new Color(0x0000A0));
		resOtOut.setFont(new Font("Calibri", Font.BOLD,20));
		resOtOut.setBounds(740,240,500,60);
	
		
		//Results for employee gross pay
		resGrossPayOut.setText("");
		resGrossPayOut.setForeground(new Color(0x0000A0));
		resGrossPayOut.setFont(new Font("Calibri", Font.BOLD,25));
		resGrossPayOut.setBounds(740,270,500,60);


		//Result for deduction of SSS
		resSssOut.setText("");
		resSssOut.setForeground(new Color(0x0000A0));
		resSssOut.setFont(new Font("Calibri", Font.BOLD,20));
		resSssOut.setBounds(740,338,500,60);
		

		//Results for deduction of Philhealth
		resPhOut.setText("");
		resPhOut.setForeground(new Color(0x0000A0));
		resPhOut.setFont(new Font("Calibri", Font.BOLD,20));
		resPhOut.setBounds(740,367,500,60);
		
		
		//Results for deduction of  pagibig
		resPiOut.setText("");
		resPiOut.setForeground(new Color(0x0000A0));
		resPiOut.setFont(new Font("Calibri", Font.BOLD,20));
		resPiOut.setBounds(740,397,500,60);


		//Results for  deduction of  tax
		resTaxOut.setText("");
		resTaxOut.setForeground(new Color(0x0000A0));
		resTaxOut.setFont(new Font("Calibri", Font.BOLD,20));
		resTaxOut.setBounds(740,427,500,60);


		//Results for total deduction
		resTotalDeducOut.setText("");
		resTotalDeducOut.setForeground(new Color(0x0000A0));
		resTotalDeducOut.setFont(new Font("Calibri", Font.BOLD,20));
		resTotalDeducOut.setBounds(740,457,500,60);


		//Result for netpay
		resNetpayOut.setText("");
		resNetpayOut.setForeground(new Color(0x0000A0));
		resNetpayOut.setFont(new Font("Calibri", Font.BOLD,30));
		resNetpayOut.setBounds(740,497,500,60);

		


		/*--------------------------------------------
		|        Adding classes to the Frame         |
		--------------------------------------------*/

		//Label for getting informations
		frame.add(emDetails);
		frame.add(emSalary);
		frame.add(label);
		frame.add(labelEmId);
		frame.add(labelEmName);
		frame.add(labelDesignation);
		
		frame.add(labelworkhour);
		frame.add(labelrate);
		frame.add(labelot);
		frame.add(labelotPay);
		
		
		//TextFields for inputs
		frame.add(emName);
		frame.add(emId);
		frame.add(inputDes);
		frame.add(inputWh);
		frame.add(inputRate);
		frame.add(inputOt);
		frame.add(inputOtPay);

		
		//Buttons
		frame.add(buttonClear);
		frame.add(buttonCompute);


		//Label for results
		frame.add(resEmId);
		frame.add(resEmName);
		frame.add(resDesignation);
		frame.add(resWorkHour);
		frame.add(resRate);
		frame.add(resOt);
		frame.add(resGrossPay);
		frame.add(resDeduction);
		frame.add(resSss);
		frame.add(resPh);
		frame.add(resPi);
		frame.add(resTax);
		frame.add(resTotalDeduc);
		frame.add(resNetpay);


		//Results of computation
		frame.add(resEmIdOut);
		frame.add(resEmNameOut);
		frame.add(resDesignationOut);
		frame.add(resWorkHourOut);
		frame.add(resRateOut);
		frame.add(resOtOut);
		frame.add(resGrossPayOut);
		frame.add(resSssOut);
		frame.add(resPhOut);
		frame.add(resPiOut);
		frame.add(resTaxOut);
		frame.add(resTotalDeducOut);
		frame.add(resNetpayOut);
		
		
		//Frame visibility and layout
		frame.setLayout(null);
		frame.setVisible(true);
		
			
		
		
	}


	//Static method for computation of salary
	public static void salaryComputation(){

		//declaring variables
		String empName, empId, empDesignation;
		double empWorkHour, empRate, empOvertime, empOtPay;
		double empGrosspay,empNetpay, empSss, empPhilhealth, empPagibig, empTax, empTotalDeduc;

		//getting string inputs
		empName = emName.getText();
		empId = emId.getText();
		empDesignation = inputDes.getText();

		//getting number inputs
		empWorkHour = Double.parseDouble(inputWh.getText());
		empRate = Double.parseDouble(inputRate.getText());
		empOvertime = Double.parseDouble(inputOt.getText());
		empOtPay = Double.parseDouble(inputOtPay.getText());

		//process for computations
		empGrosspay = (empWorkHour*empRate) + (empOvertime*empOtPay);
		empSss = empGrosspay * 0.06;
		empPhilhealth = empGrosspay * 0.03;
		empPagibig = empGrosspay * 0.09;
		empTax = empGrosspay * 0.08;
		empTotalDeduc = empSss + empPhilhealth + empPagibig + empTax;
		empNetpay = empGrosspay - empTotalDeduc;


		//output for employee name, id and designation
		resEmNameOut.setText(empName);
		resEmIdOut.setText(empId);
		resDesignationOut.setText(empDesignation);


		//output of computation
		resWorkHourOut.setText(String.valueOf(String.format("%,.2f",empWorkHour)));
		resRateOut.setText(String.valueOf(String.format("%,.2f",empRate)));
		resOtOut.setText(String.valueOf(String.format("%,.2f",empOvertime)));
		resGrossPayOut.setText(String.valueOf(String.format("%,.2f",empGrosspay)));

		//output for deduction of sss, philhealth and pag ibig
		resSssOut.setText(String.valueOf(String.format("%,.2f",empSss)) + " (6%)");
		resPhOut.setText(String.valueOf(String.format("%,.2f",empPhilhealth)) + " (3%)");
		resPiOut.setText(String.valueOf(String.format("%,.2f",empPagibig)) + " (9%)");	
		resTaxOut.setText(String.valueOf(String.format("%,.2f",empTax)) + " (8%)");

		//output for total deductions and net pay
		resTotalDeducOut.setText(String.valueOf(String.format("%,.2f",empTotalDeduc)));
		resNetpayOut.setText(String.valueOf(String.format("%,.2f",empNetpay)));

	}


	//method to clear the inputs and outputs 
	public static void clearInputsOutputs(){

		//clear the inputs
		emId.setText("");
		emName.setText("");
		inputDes.setText("");
		inputWh.setText("");
		inputRate.setText("");
		inputOt.setText("");
		inputOtPay.setText("");

		//clear the outputs
		resEmIdOut.setText("");
		resEmNameOut.setText("");
		resDesignationOut.setText("");
		resWorkHourOut.setText("");
		resRateOut.setText("");
		resOtOut.setText("");
		resGrossPayOut.setText("");
		resSssOut.setText("");
		resPhOut.setText("");
		resPiOut.setText("");
		resTaxOut.setText("");
		resTotalDeducOut.setText("");
		resNetpayOut.setText("");


	}



	@Override
	public void actionPerformed(ActionEvent e){


		//if the user clicked the compute button, the program will compute for the employee salary
		if (e.getSource() == buttonCompute){

			Frame.salaryComputation();

		}

		//if the user clicked other button, in this case the "clear" button, the inputs and outputs will be erased
		else{

			Frame.clearInputsOutputs();
	
		}



	}


}

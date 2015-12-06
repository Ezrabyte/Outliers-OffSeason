package org.usfirst.frc.team5687.robot.subsystems;
import org.usfirst.frc.team5687.robot.OI;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class pneumatics{
	OI testOi;
	boolean pistonOff;
	DoubleSolenoid testDouble; 
	
	public void Test(){
		testOi = new OI();
		pistonOff = testOi.pistonOff();
		testDouble = new DoubleSolenoid(1, 2); 
		if(pistonOff){
			
			testDouble.set(DoubleSolenoid.Value.kOff);
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
		
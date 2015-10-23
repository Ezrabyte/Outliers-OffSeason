package org.usfirst.frc.team5687.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.usfirst.frc.team5687.robot.OI.pistonOff;
public class pneumatics {

	DoubleSolenoid  testDouble = new DoubleSolenoid(1, 2); 
	
	public void Test(){
	if(PistonOff){
		
		testDouble.set(DoubleSolenoid.Value.kOff);
	}
	}

	
	
	
	
	
	
	
	
	
	
	public void pistonOut() throws InterruptedException { 
	if(getPistonOffButton){
		testDouble.set(DoubleSolenoid.Value.kOff);
	}
	}
		
		
		
	}

}

testDouble.set(DoubleSolenoid.Value.kForward);
Thread.sleep(1000);
		testDouble.set(DoubleSolenoid.Value.kReverse);
		Thread.sleep(1000);
		
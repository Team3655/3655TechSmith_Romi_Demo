// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

/** Add your docs here. */
public class DrivetrainSubsystem {

    private final Spark m_LeftMotor = new Spark(0);
    private final Spark m_RightMotor = new Spark(1);


    private final DifferentialDrive m_DiffDrive = new DifferentialDrive(m_LeftMotor, m_RightMotor);

    public void arcadeDrive(Double xSpeed, Double zRotation){
        m_DiffDrive.arcadeDrive(xSpeed, zRotation);
    }
    public DrivetrainSubsystem(){
        m_RightMotor.setInverted(true);
    }
}

package com.iritech.demo;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Iddk2000Main {
	


	public Iddk2000Main(String name, String path) {
		super();
		this.name = name;
		this.path = path;
	}


	private String name;
	private String path;
	
	
	

	public static void main(String[] args) {
		functionCapture.g_binDir = System.getProperty("user.dir");

		getIris();
	}


public static  void getIris(){

		functionCapture features = new functionCapture();
		int option = -1;

		features.open_device();

		ArrayList<Eye> eyes = features.capturing_process(false, false, true);
		
		for(Eye pData : eyes){

			FileOutputStream fos;
			boolean result = false;
			
			try
			{
				fos = new FileOutputStream(System.getProperty("user.dir") + "\\" + pData.getFilename());
			    fos.write(pData.getpData());
			    result = true;
			    fos.close();
			}
			catch(FileNotFoundException ex)
			{
				System.out.println("FileNotFoundException : " + ex);
			}
			catch(IOException ioe)
			{
			    System.out.println("IOException : " + ioe);
			}
		}

		
		
		features.finalize_device();

}
















































/*

	static void iritech_guide(String message)
	{
		System.out.print("**********************************************************************\n");
		System.out.print("Usage:\n");
		System.out.print(introduction);
		System.out.print("\n\tCopyright(C) 2012 by IriTech, Inc. All rights reserved.");
		System.out.print("\n**********************************************************************\n");
		System.out.print("Please press ENTER to continue ...\n");
		try {
			InputStreamReader inputStream = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(inputStream);
			reader.readLine();
		} catch (IOException e) {
			System.out.print("IO exception happens here !\n");
			e.printStackTrace();
		}
	}*/
/*
	static void print_menu()
	{
		Iddk2000Features features = new Iddk2000Features();
		int option = -1;

		iritech_guide(introduction);

		features.open_device();

		while(true)
		{
			System.out.print("\nMAIN MENU: Select one of the features below\n");
			option = Iddk2000Utils.display_menu(main_menu, main_menu.length, -1);

			if(option != 9 && option != -1)
			{
				System.out.print("\n\n*************** " + main_menu[option - 1] + " ***************\n\n");
			}

			switch(option)
			{
			case -1:
				System.out.println("djdhdjk");
				break;
			case 1:
				features.login();
				break;
			case 2:
				features.logout();
				break;
			case 3:
				features.device_configuration();
				break;
			case 4:
				features.get_information();
				break;
			case 5:
				features.capturing_process(false, true, true);
				break;
			case 6:
				features.iris_recognition();
				break;
			case 7:
				features.power_management();
				break;
			case 8:
				features.recovery();
				break;
			}

			if(option != 9 && option != -1)
			{
				System.out.print("\n\n***********************************************\n\n");
			}
			if(option == 9) break;
		}

		features.finalize_device();
	}*/

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPath() {
	return path;
}


public void setPath(String path) {
	this.path = path;
}

}

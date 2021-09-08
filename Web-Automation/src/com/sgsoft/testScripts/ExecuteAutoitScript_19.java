package com.sgsoft.testScripts;

public class ExecuteAutoitScript_19 {

	public static void main(String[] args) {
		executeAutoITScript();
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("F:\\AutoitTestScript\\AutoitScriptFile.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
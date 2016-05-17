package com.rhisco.learning.plugin;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("Hello Plugin World");
		
		PluginService ps = new PluginService("C:/Temp/myclasspath/", "mytegraplugin");

	}

}

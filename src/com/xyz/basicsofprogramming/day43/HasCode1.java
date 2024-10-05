package com.xyz.basicsofprogramming.day43;

class OS {

		float version;
		String name;
		public OS(float version, String name) {
			super();
			this.version = version;
			this.name = name;
		}
		public float getVersion() {
			return version;
		}
		public String getName() {
			return name;
		}
		
	}
	class Charger{
		String company;
		float voltage;
		public Charger(String company, float voltage) {
			super();
			this.company = company;
			this.voltage = voltage;
		}
		public String getCompany() {
			return company;
		}
		public float getVoltage() {
			return voltage;
		}
		
	}
	class Mobile{
		OS os=new OS (8.7f,"IOS");
		void hasCharger(Charger c) {
			System.out.println(c.getCompany());
			System.out.println(c.getVoltage());
		}
	}

	public class HasCode1{
		public static void main(String[] args) {
			Mobile m=new Mobile();
			Charger c=new Charger("samsung",5.5f);
			System.out.println("Representation using enclosing object");
			System.out.println(m.os.getName());
			System.out.println(m.os.getVersion());
			m.hasCharger(c);
			System.out.println("=========");
			m=null;
			System.out.println("Representation without using enclosing object");
			System.out.println(c.getCompany());
			System.out.println(c.getVoltage());
			System.out.println("==============");
			System.out.println(m.os.getName());
			System.out.println(m.os.getVersion());
			m.hasCharger(c);
		}

	}


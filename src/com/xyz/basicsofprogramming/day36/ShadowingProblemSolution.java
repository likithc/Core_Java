package com.xyz.basicsofprogramming.day36;

	class dog3{
		private String name;
		private String color;
		private String breed;
		private int cost;
		private int age;
		
		void setData(String name,String color,String breed,int cost,int age) {
			this.name = name;
			this.color = color;
			this.breed =breed;
			this.cost = cost;
			this.age = age;
		}
		void setName(String name) {
			this.name = name;
		}
		void setColor(String color) {
			this.color = color;
		}
		void setBreed(String breed) {
			this.breed = breed;
		}
		void setCost(int cost) {
			this.cost = cost;
		}
		void setAge(int age) {
			this.age =age;
		}
		void getData() {
			System.out.println(name);
			System.out.println(color);
			System.out.println(breed);
			System.out.println(cost);
			System.out.println(age);
			
		}
		
		String getName() {
			return name;
		}
		String getColor() {
			return color;
		}
		String getBreed() {
			return breed;
		}
		int getCost(){
			return cost;
		}
		int getAge(){
			return age;
		}
	}

	public class ShadowingProblemSolution {

		public static void main(String[] args) {
			dog3 d2= new dog3();
			//generic setter
			d2.setData("nigga", "black", "GR", 6000, 12);
			////generic getter
			d2.getData();
			System.out.println("--------------------------------");
			//specific setter
			d2.setName("nigga");
			d2.setColor("black");
			d2.setBreed("GR");
			d2.setCost(6000);
			d2.setAge(9);
			//specific getter
			System.out.println(d2.getName());
			System.out.println(d2.getColor());
			System.out.println(d2.getBreed());
			System.out.println(d2.getCost());
			System.out.println(d2.getAge());
			
			
			
			
		}

	}



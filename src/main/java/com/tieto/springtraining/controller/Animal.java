package com.tieto.springtraining.controller;

import java.io.Serializable;

import org.springframework.stereotype.Component;


	@Component
	public class Animal implements Serializable {
		
		private String type;
		private String name;

		private String year;

		/**
		 * Default constructor
		 */
		
		public Animal(){
			
		}
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return this.getType() + ", " + this.getName() + ", " + this.getYear() + "\n";
		}
		

	}
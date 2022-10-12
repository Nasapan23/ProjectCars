package logic;

import java.util.Scanner;

public class Station {
	int StationPosX;
	int StationPosY;
	int DieselPrice;
	int GasPrice;
	String StationName;
	 public Station(int StationPosX,int StationPosY,int DieselPrice,int GasPrice,String StationName) {
		 this.StationPosX=StationPosX;
		 this.StationPosY=StationPosY;
		 this.DieselPrice=DieselPrice;
		 this.GasPrice=GasPrice;
		 this.StationName=StationName;
	 }
	 public void setStationPosX(int StationPosX) {
		 this.StationPosX=StationPosX;
	 }
	 public void setStationPosY(int StationPosY) {
		 this.StationPosY=StationPosY;
	 }
	 public void setDieselPrice(int DieselPrice) {
		 this.DieselPrice=DieselPrice;
	 }
	 public void setGasPrice(int GasPrice) {
		 this.GasPrice=GasPrice;
	 }
	 public void setStationName(String StationName) {
		 this.StationName=StationName;
	 }
	 public int getStationPosX() {
		 return StationPosX;
	 }
	 public int getStationPosY() {
		 return StationPosY;
	 }
	 public int getDieselPrice() {
		 return DieselPrice;
	 }
	 public int getGasPrice() {
		 return GasPrice;
	 }
	 public String getStationName() {
		 return StationName;
	 }
	 
	 //
	 public static void DiselConsumption() {
		 
	 }
	 public static void GasConsumption() {
		 
	 }
}

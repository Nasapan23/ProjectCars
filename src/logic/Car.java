package logic;
import java.lang.Math;

public class Car {
	int PosX;
	int PosY;
	int CarRadius;
	int GasMoney;
	String CarName;
	boolean IsDiesel;
	public Car(int PosX,int PosY,int CarRadius,
			String CarName,boolean IsDiesel){
		this.PosX=PosX;
		this.PosY=PosY;
		this.CarRadius=CarRadius;
		this.CarName=CarName;
	}
	public void SetPosX (int PosX) {
		this.PosX=PosX;
	}
	public void SetPosY(int PosY) {
		this.PosY=PosY;
	}
	public void SetCarRadius(int CarRadius) {
		this.CarRadius=CarRadius;
	}
	public void SetCarName(String CarName) {
		this.CarName=CarName;
	}
	public void SetIsDiesel(boolean IsDiesel) {
		this.IsDiesel=IsDiesel;
	}
	public void SetDriverMoney(int GasMoney) {
		this.GasMoney=GasMoney;
	}
	public int GetPosX() {
		return PosX;
	}
	public int GetPosY() {
		return PosY;
	}
	public int GetCarRadius() {
		return CarRadius;
	}
	public String GetCarName() {
		return CarName;
	}
	public boolean GetIsDiesel() {
		return IsDiesel;
	}
	public int GetGasMoney() {
		return GasMoney;
	}
	public String toString(){
		return this.PosX +" " +this.PosY+" "+ this.CarRadius+" "+ this.CarName+" "+ this.IsDiesel;
	}
}

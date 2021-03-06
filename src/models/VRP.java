/**   
* @Title: VRP.java 
* @Package models 
* @Description: TODO(用一句话描述该文件做什么) 
* @author FlyingFish
* @date 2017-05-20
* @version V1.0   
*/
package models;

/**
* <p> VRP</p>
* <p> </p>
* @author FlyingFish
* @date 2017-05-20
*/
public class VRP {
// Vehicle Routing Planning	

	public int carID;
	
	//申请入库时间
	public int requestTime;
	
	//最大等待时间
	public int longestWatingTime;
	
	//申请出库时间
	public int pullOutTime;
	
	//汽车质量
	public int carMass;
	
	/** 
	* <p>构造函数 </p> 
	* <p>Description: </p> 
	* @param id
	* @param rt
	* @param lwt
	* @param pot
	* @param mass 
	*/
	public VRP(int id,int rt,int lwt,int pot,int mass){
		carID = id;
		requestTime = rt;
		longestWatingTime = lwt;
		pullOutTime = pot;
		carMass = mass;
	}
	
	/** 
	* @Fields refused : TODO(是否据载) 
	*/ 
	private boolean refused;
	
	//每个接受的申请对应了入库(task1)、和出库任务(task2)
	private Task task1,task2;
	
	/** 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param args 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

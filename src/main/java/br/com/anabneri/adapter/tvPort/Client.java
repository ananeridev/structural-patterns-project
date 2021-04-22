package br.com.anabneri.adapter.tvPort;

import br.com.anabneri.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.anabneri.adapter.tvPort.devices.Computer;
import br.com.anabneri.adapter.tvPort.devices.OldMonitor;
import br.com.anabneri.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Phoebe and guitar", "Smelly cat song");
		
		System.out.println("------ Monitor ----------");
		Computer pc2 = new Computer();
		OldMonitor oldMonitor = new OldMonitor();
		//pc2.connectPort(monitor.getConnector());  //Don't work! That's the reason why we create the adapter
		pc2.sendImageAndSound("Phoebe and giutar", "Smelly cat song");


		System.out.println("------ Monitor Class Adapter ----------");
		Computer pc3 =  new Computer();
		HDMIToOldMonitorAdapter monitorAdapter = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdapter);
		pc3.sendImageAndSound("Phoebe and giutar", "Smelly cat song");


	}
}

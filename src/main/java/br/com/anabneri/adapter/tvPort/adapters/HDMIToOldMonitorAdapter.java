package br.com.anabneri.adapter.tvPort.adapters;

import br.com.anabneri.adapter.tvPort.devices.OldMonitor;
import br.com.anabneri.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping up the VGA's OldMonitor's interface with a HDMI adapter....");
    }

    @Override
    public void setImage(String image) {
        System.out.println("COnverting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry dude, but the sound doesn't work here :/ ....");
    }
}

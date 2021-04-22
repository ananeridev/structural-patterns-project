package br.com.anabneri.adapter.tvPort.adapters;


import br.com.anabneri.adapter.tvPort.intefaces.HDMI;
import br.com.anabneri.adapter.tvPort.intefaces.VGA;

// this class may to work with Heritage and Composition

// Adapter for object
public class HDMIToVGAAdapter  implements HDMI {
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Conecting the VGA/HDMI adapter......");
        this.vga = vga;
    }

    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA......");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry dude, but the sound doesn't work here :/ ....");
    }
}

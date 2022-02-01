package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD() {
        this.discType = "cd";
        this.lowSpinRpm = 200;
        this.highSpinRpm = 500;
    }

    public void playAudio() {

    }
    @Override
    public String read(){
        System.out.println("read() ran successfully");
        return contents;
    }
    @Override
    public void write(String data){
        contents = data;
        System.out.println("write() ran successfully");
    }

    @Override
    public void spin() {
        System.out.println("spin() ran successfully");
    }
}

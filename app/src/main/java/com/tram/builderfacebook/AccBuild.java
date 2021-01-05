package com.tram.builderfacebook;

public interface AccBuild{
        //name and phone is required
        AccBuild withEmail(String email);
        AccBuild withAddress(String address);
        AccBuild withAge(Integer age);
        AccBuild withArea(String area);
        AccFacbook Build();

}

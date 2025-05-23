package Magazin2.Clase;

import Magazin2.Interfaces.*;

public class Magazin implements IMagazin{

	@Override
	public double getTotal(ICosCumparaturi cos, IClient client) {
		double costTransport=0;
		if(cos.getTotal()<200) {
			if(client.getAdresa().equals("Bucuresti")) {
			costTransport=10;
			}
			else {
				costTransport=20;
			}
		}
		else {
			costTransport=0;
		}
		return costTransport+cos.getTotal();
	}

}

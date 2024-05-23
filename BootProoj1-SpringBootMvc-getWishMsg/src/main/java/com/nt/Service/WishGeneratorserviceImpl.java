package com.nt.Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class WishGeneratorserviceImpl implements IWishGenerator {

	@Override
	public String getWishMessage() {

		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour<12)
			return "GoodMorning";
		else if(hour>=12 && hour<16)
			return "GoodAfterNoon";
		else if(hour>=16 && hour<18)
			return "GoodEvening";
		else
			return "GoodNight";
	}

}

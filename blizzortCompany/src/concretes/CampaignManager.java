package concretes;

import abstracts.ICampaignService;
import entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.printf("{0} Kampanyası Sisteme Eklendi", campaign.getCampName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.printf("{0} Kampanyasına Dair Bilgiler Güncellendi.", campaign.getCampName());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.printf("{0} Kampanyası Sistemden Silindi.", campaign.getCampName());
	}

}

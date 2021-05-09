package concretes;

import abstracts.ICampaignService;
import entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.printf("{0} Kampanyas� Sisteme Eklendi", campaign.getCampName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.printf("{0} Kampanyas�na Dair Bilgiler G�ncellendi.", campaign.getCampName());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.printf("{0} Kampanyas� Sistemden Silindi.", campaign.getCampName());
	}

}

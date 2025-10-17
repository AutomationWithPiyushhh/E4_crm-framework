package listeners_extra;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_utility.BaseClass;

@Listeners(listeners_extra.List_Imp.class)
public class CampaignTest extends BaseClass {
	@Test
	public void createCampaignTest() throws IOException {
		System.out.println("could not be Created campaign");
		Assert.assertTrue(false);
	}
}

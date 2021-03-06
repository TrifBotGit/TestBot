package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Zone {
	
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("resources")
	@Expose
	private List<Resource> resources = null;

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public List<Resource> getResources() {
	return resources;
	}

	public void setResources(List<Resource> resources) {
	this.resources = resources;
	}

}

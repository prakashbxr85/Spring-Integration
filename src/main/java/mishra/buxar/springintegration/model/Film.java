package mishra.buxar.springintegration.model;

import java.math.BigInteger;

public class Film {
	
	private BigInteger id;
	private String name;
	private String showTime;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((showTime == null) ? 0 : showTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Film)) {
			return false;
		}
		Film other = (Film) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (showTime == null) {
			if (other.showTime != null) {
				return false;
			}
		} else if (!showTime.equals(other.showTime)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", name=" + name + ", showTime=" + showTime + "]";
	}

}

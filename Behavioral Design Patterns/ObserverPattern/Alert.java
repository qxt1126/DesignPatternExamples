package ObserverPattern;

import java.util.List;

public class Alert {
	private int subElementId;
	private int metricMetadataId;
	private int metricMetadataHourlyId;
	private float metricValue;

	public Alert(int subElementId, int metricMetadataId,
			int metricMetadataHourlyId, float metricValue,
			List<Integer> elementsEffected) {
		super();
		this.subElementId = subElementId;
		this.metricMetadataId = metricMetadataId;
		this.metricMetadataHourlyId = metricMetadataHourlyId;
		this.metricValue = metricValue;
	}

	public int getSubElementId() {
		return subElementId;
	}

	public void setSubElementId(int subElementId) {
		this.subElementId = subElementId;
	}

	public int getMetricMetadataId() {
		return metricMetadataId;
	}

	public void setMetricMetadataId(int metricMetadataId) {
		this.metricMetadataId = metricMetadataId;
	}

	public int getMetricMetadataHourlyId() {
		return metricMetadataHourlyId;
	}

	public void setMetricMetadataHourlyId(int metricMetadataHourlyId) {
		this.metricMetadataHourlyId = metricMetadataHourlyId;
	}

	public float getMetricValue() {
		return metricValue;
	}

	public void setMetricValue(float metricValue) {
		this.metricValue = metricValue;
	}
}

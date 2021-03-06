package com.github.mertakdut;

import java.util.List;

class NavPoint {
	private String id;
	private int playOrder;
	private String navLabel;
	private String contentSrc;

	private String type;
	private String value;

	private boolean markedToDelete;

	// Additional cropped file navPoint variables.
	private int typeCode; // 0 - realNavPoint, 1 - anchoredPart, 2 - trimmedPart
	private String entryName;
	private int bodyTrimStartPosition;
	private int bodyTrimEndPosition;
	private List<Tag> openTags;
	private boolean isCalculated;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPlayOrder() {
		return playOrder;
	}

	public void setPlayOrder(int playOrder) {
		this.playOrder = playOrder;
	}

	public String getNavLabel() {
		return navLabel;
	}

	public void setNavLabel(String navLabel) {
		this.navLabel = navLabel;
	}

	public String getContentSrc() {
		return contentSrc;
	}

	public void setContentSrc(String contentSrc) {
		this.contentSrc = contentSrc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isMarkedToDelete() {
		return markedToDelete;
	}

	public void setMarkedToDelete(boolean markedToDelete) {
		this.markedToDelete = markedToDelete;
	}

	public int getBodyTrimStartPosition() {
		return bodyTrimStartPosition;
	}

	public void setBodyTrimStartPosition(int bodyTrimStartPosition) {
		this.bodyTrimStartPosition = bodyTrimStartPosition;
	}

	public int getBodyTrimEndPosition() {
		return bodyTrimEndPosition;
	}

	public void setBodyTrimEndPosition(int bodyTrimEndPosition) {
		this.bodyTrimEndPosition = bodyTrimEndPosition;
	}

	public List<Tag> getOpenTags() {
		return openTags;
	}

	public void setOpenTags(List<Tag> openTags) {
		this.openTags = openTags;
	}

	public int getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

	public boolean isCalculated() {
		return isCalculated;
	}

	public void setCalculated(boolean isCalculated) {
		this.isCalculated = isCalculated;
	}
}

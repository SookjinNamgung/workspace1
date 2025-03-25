package com.workspace.board.model.vo;

public class TcommBltBasModel {
	
	String bltNo; //번호
	String bltTit; // 제목
	String bltSstc; //내용
	String wrtrNo;
	String wrtrNm;
	String useYn;
	String delYn;
	String regDts;
	String modDts;
	String condition;
	String keyword;
	String boardId;
	
	
	
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getBltNo() {
		return bltNo;
	}
	public void setBltNo(String bltNo) {
		this.bltNo = bltNo;
	}
	public String getBltTit() {
		return bltTit;
	}
	public void setBltTit(String bltTit) {
		this.bltTit = bltTit;
	}
	public String getBltSstc() {
		return bltSstc;
	}
	public void setBltSstc(String bltSstc) {
		this.bltSstc = bltSstc;
	}
	public String getWrtrNo() {
		return wrtrNo;
	}
	public void setWrtrNo(String wrtrNo) {
		this.wrtrNo = wrtrNo;
	}
	public String getWrtrNm() {
		return wrtrNm;
	}
	public void setWrtrNm(String wrtrNm) {
		this.wrtrNm = wrtrNm;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getRegDts() {
		return regDts;
	}
	public void setRegDts(String regDts) {
		this.regDts = regDts;
	}
	public String getModDts() {
		return modDts;
	}
	public void setModDts(String modDts) {
		this.modDts = modDts;
	}
	@Override
	public String toString() {
		return "TcommBltBasModel [bltNo=" + bltNo + ", bltTit=" + bltTit + ", bltSstc=" + bltSstc + ", wrtrNo=" + wrtrNo
				+ ", wrtrNm=" + wrtrNm + ", useYn=" + useYn + ", delYn=" + delYn + ", regDts=" + regDts + ", modDts="
				+ modDts + ", condition=" + condition + ", keyword=" + keyword + "]";
	}
	
	
	
	
}

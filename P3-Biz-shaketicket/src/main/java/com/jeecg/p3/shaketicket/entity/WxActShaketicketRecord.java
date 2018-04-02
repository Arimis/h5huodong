package com.jeecg.p3.shaketicket.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActShaketicketRecord:抽奖记录表<br>
 * @author pituo
 * @since：2015年12月23日 13时55分34秒 星期三 
 * @version:1.0
 */
public class WxActShaketicketRecord implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
		return awardId;
	}
	public void setAwardId(String awardId) {
		this.awardId = awardId;
	}
	public String getDrawStatus() {
		return drawStatus;
	}
	public void setDrawStatus(String drawStatus) {
		this.drawStatus = drawStatus;
	}
	
	/**
	 *奖品名称
	 */
	private String awardsName;
	public String getAwardsName() {
		return awardsName;
	}
	public void setAwardsName(String awardsName) {
		this.awardsName = awardsName;
	}
	/**
	 *卡券id
	 */
	private String cardId;
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
}

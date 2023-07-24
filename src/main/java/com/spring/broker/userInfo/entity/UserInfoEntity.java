package com.spring.broker.userInfo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_USER_INFO")
public class UserInfoEntity {

	/** 사용자 일련번호 */
   	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "USER_SN")
	private BigDecimal userSn;

	/** 사용자 ID */
	@Column(name = "USER_ID")
	private String userId;

	/** 사용자 성명 */
	@Column(name = "USER_NM")
	private String userNm;

	/** 사용자 연령 */
	@Column(name = "USER_AGE")
	private BigDecimal userAge;

}

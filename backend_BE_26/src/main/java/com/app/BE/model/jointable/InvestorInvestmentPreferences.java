package com.app.BE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.BE.model.Stage;
import com.app.BE.model.Startup;
import com.app.BE.model.FundingRound;
import com.app.BE.model.Founder;
import com.app.BE.model.Document;
import com.app.BE.model.Investor;
import com.app.BE.enums.RoundStatus;
import com.app.BE.enums.StageName;
import com.app.BE.converter.StageNameConverter;
import com.app.BE.converter.RoundStatusConverter;

@Entity(name = "InvestorInvestmentPreferences")
@Table(schema = "\"be_030\"", name = "\"InvestorInvestmentPreferences\"")
@Data
public class InvestorInvestmentPreferences{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"InvestorId\"")
	private Integer investorId;

    
    @Column(name = "\"InvestmentPreferences\"")
    private Integer investmentPreferences;
}
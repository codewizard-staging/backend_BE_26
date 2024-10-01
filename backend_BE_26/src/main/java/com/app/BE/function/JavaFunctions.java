package com.app.BE.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.BE.repository.FundingRoundRepository;
import com.app.BE.repository.StageRepository;
import com.app.BE.repository.DocumentRepository;
import com.app.BE.repository.InvestorRepository;
import com.app.BE.repository.FounderRepository;
import com.app.BE.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   

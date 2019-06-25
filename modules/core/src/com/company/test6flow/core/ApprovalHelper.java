package com.company.test6flow.core;

import org.springframework.stereotype.Component;
import com.company.test6flow.entity.Sender;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;

import javax.inject.Inject;
import java.util.UUID;

@Component(ApprovalHelper.NAME)
public class ApprovalHelper {
    public static final String NAME = "demo_ApprovalHelper";

    @Inject
    private Persistence persistence;

    public void updateState(UUID entityId, String state) {
        try (Transaction tx = persistence.getTransaction()) {
            Sender contract = persistence.getEntityManager().find(Sender.class, entityId);
            if (contract != null) {
                contract.setState(state);
            }
            tx.commit();
        }
    }
}
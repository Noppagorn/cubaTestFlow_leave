package com.company.test6flow.web.screens.headdeside;

import com.haulmont.cuba.gui.screen.*;
import com.company.test6flow.entity.HeadDeside;

@UiController("test6flow_HeadDeside.browse")
@UiDescriptor("head-deside-browse.xml")
@LookupComponent("headDesidesTable")
@LoadDataBeforeShow
public class HeadDesideBrowse extends StandardLookup<HeadDeside> {

}
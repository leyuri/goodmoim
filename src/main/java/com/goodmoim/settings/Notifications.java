package com.goodmoim.settings;

import com.goodmoim.domain.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notifications {


    private boolean meetCreatedByEmail;

    private boolean meetCreatedByWeb;

    private boolean meetEnrollmentResultByEmail;

    private boolean meetEnrollmentResultByWeb;

    private boolean meetUpdatedByEmail;

    private boolean meetUpdatedByWeb;

    public Notifications(Account account) {
        this.meetCreatedByEmail = account.isMeetCreatedByEmail();
        this.meetCreatedByWeb = account.isMeetCreatedByWeb();
        this.meetEnrollmentResultByEmail = account.isMeetEnrollmentResultByEmail();
        this.meetEnrollmentResultByWeb = account.isMeetEnrollmentResultByWeb();
        this.meetUpdatedByEmail = account.isMeetUpdatedByEmail();
        this.meetUpdatedByWeb = account.isMeetUpdatedByWeb();
    }


}

package com.goodmoim.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickname;

    private String password;

    private boolean emailVerified;

    private String emailCheckToken;

    private LocalDateTime joinedAt;

    private String bio; //짧은 자기소개

    private String url;

    private String occupation; //직업

    private String location;

    @Lob @Basic(fetch = FetchType.EAGER)
    private String profileImage;

    private boolean meetCreatedByEmail;

    private boolean meetCreatedByWeb;

    private boolean meetEnrollmentResultByEmail;

    private boolean meetEnrollmentResultByWeb;

    private boolean meetUpdatedByEmail;

    private boolean meetUpdatedByWeb;

    public void generateEmailCheckToken() {
        this.emailCheckToken = UUID.randomUUID().toString();
    }

    // 이 두 라인은 account 에서 한번에 이루어져야 한다. (같은 로직)
    public void completeSignUp(Account account) {
        this.emailVerified = true;
        this.joinedAt = LocalDateTime.now();
    }
}

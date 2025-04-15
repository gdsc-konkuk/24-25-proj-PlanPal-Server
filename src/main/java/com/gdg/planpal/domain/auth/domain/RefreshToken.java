package com.gdg.planpal.domain.auth.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@Entity
public class RefreshToken {

    @Id
    @Column(name = "rt_key")
    private Long key;

    @Column(name = "rt_value")
    private String value;

    @Builder
    public RefreshToken(Long key, String value) {
        this.key = key;
        this.value = value;
    }
}

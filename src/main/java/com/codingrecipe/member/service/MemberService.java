package com.codingrecipe.member.service;

import com.codingrecipe.member.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberReporitory memberReporitory;
    public void save(MemberDTO memberDTO) {
    }
}

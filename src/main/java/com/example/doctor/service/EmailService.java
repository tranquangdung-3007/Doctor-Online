package com.example.doctor.service;

import com.example.doctor.model.dto.EmailTemplateDTO;

public interface EmailService {

    boolean sendEmailForRegister(EmailTemplateDTO emailTemplateDTO);

    boolean sendEmailForCheckout(EmailTemplateDTO emailTemplateDTO);

    boolean sendEmailForResetPassword(EmailTemplateDTO emailTemplateDTO);

}

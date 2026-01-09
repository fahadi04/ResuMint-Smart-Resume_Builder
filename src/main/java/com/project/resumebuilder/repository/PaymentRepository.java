package com.project.resumebuilder.repository;

<<<<<<< HEAD:src/main/java/com/project/resumebuilder/repository/PaymentRepository.java
import com.project.resumebuilder.modals.Payment;
=======
import com.project.resumebuilder.document.Payment;
>>>>>>> 2e6bd7391b2314686e5031531703650826b2533d:resumebuilder/src/main/java/com/project/resumebuilder/repository/PaymentRepository.java
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends MongoRepository<Payment, String> {

    Optional<Payment> findByRazorpayOrderId(String razorpayOrderId);

    Optional<Payment> findByRazorpayPaymentId(String razorpayPaymentId);

    List<Payment> findByUserIdOrderByCreatedAtDesc(String userId);

    List<Payment> findByStatus(String status);


}

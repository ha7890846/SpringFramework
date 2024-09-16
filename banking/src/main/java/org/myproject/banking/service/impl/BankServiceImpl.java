package org.myproject.banking.service.impl;

import org.myproject.banking.service.BankService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Override
    public List<String> getBranches() {
        return Arrays.asList(
            "Branch 1 - Shanthinagar, Bangalore",
                "Branch 2 - Basavanagudi, Bangalore",
                "Branch 3 - Rajajinagar, Bangalore",
                "Branch 4 - Sadashivnagar, Bangalore",
                "Branch 5 - Malleshwaram, Bangalore",
                "Branch 6 - Banashankari, Bangalore",
                "Branch 7 - Domlur, Bangalore",
                "Branch 8 - Jayanagar, Bangalore",
                "Branch 9 - Koramangala, Bangalore",
                "Branch 10 - Indiranagar, Bangalore"
        );
    }

    @Override
    public List<String> getServices() {
        return Arrays.asList(
                "Loan Service", "Credit Card Service", "Forex Service",
                "Wealth Management", "Mobile Banking", "Net Banking"
        );
    }
}

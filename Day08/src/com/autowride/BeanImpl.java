package com.autowride;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 2)
@Component
public class BeanImpl implements BeanInterface {
}

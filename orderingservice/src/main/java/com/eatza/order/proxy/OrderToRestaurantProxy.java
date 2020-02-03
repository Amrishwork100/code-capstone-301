
package com.eatza.order.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eatza.order.dto.ItemFetchDto;

@FeignClient("restaurant-service")
@RequestMapping("/item")
public interface OrderToRestaurantProxy {

	@GetMapping("/id/{itemId}")
	public ItemFetchDto getMenuItemById(@PathVariable Long itemId);

}

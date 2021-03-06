package com.Basil.BraberShop.services;

import com.Basil.BraberShop.dto.request.AddShopRequest;
import com.Basil.BraberShop.dto.request.ShopFilterRequest;
import com.Basil.BraberShop.models.Shop;

import java.util.List;

public interface ShopService {


      void updateShop(AddShopRequest addShopRequest);
      Shop getShopById(Long id);
      List<List<Shop>> getAllShop();
      List<Shop> getShopsByFilter(ShopFilterRequest shopFilterRequest);
      Shop getShopByUserName(String username);

}

package ru.qoqqi.farmrancher.common.trading;

import net.minecraft.world.item.trading.MerchantOffers;

import ru.qoqqi.farmrancher.common.blocks.entities.TradingBlockEntity;

public interface OfferListFactory {

	MerchantOffers createOffers(TradingBlockEntity blockEntity);
}

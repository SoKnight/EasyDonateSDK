package ru.easydonate.easydonate4j.callback.data.model.jackson.purchase;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import ru.easydonate.easydonate4j.callback.data.model.purchase.CouponDiscount;
import ru.easydonate.easydonate4j.callback.data.model.purchase.Discounts;
import ru.easydonate.easydonate4j.callback.data.model.purchase.MassSaleDiscount;
import ru.easydonate.easydonate4j.json.serialization.Implementing;
import ru.easydonate.easydonate4j.util.Wrapper;

import java.util.Objects;
import java.util.Optional;

@Implementing(Discounts.class)
public class DiscountsModel implements Discounts {

    @JsonProperty("massSale")
    private MassSaleDiscount activeMassSale;
    @JsonProperty("coupon")
    private CouponDiscount usedCoupon;

    @JsonIgnore
    @Override
    public @NotNull Optional<MassSaleDiscount> getActiveMassSale() {
        return Wrapper.wrapNullable(activeMassSale);
    }

    @JsonIgnore
    @Override
    public @NotNull Optional<CouponDiscount> getUsedCoupon() {
        return Wrapper.wrapNullable(usedCoupon);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountsModel that = (DiscountsModel) o;
        return Objects.equals(activeMassSale, that.activeMassSale) &&
                Objects.equals(usedCoupon, that.usedCoupon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeMassSale, usedCoupon);
    }

    @Override
    public @NotNull String toString() {
        return "DiscountsModel{" +
                "activeMassSale=" + activeMassSale +
                ", usedCoupon=" + usedCoupon +
                '}';
    }

}
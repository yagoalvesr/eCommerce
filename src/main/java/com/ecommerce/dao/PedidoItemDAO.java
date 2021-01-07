package com.ecommerce.dao;

import com.ecommerce.domain.Cliente;
import com.ecommerce.domain.PedidoItem;
import com.ecommerce.domain.pk.PedidoItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoItemDAO extends JpaRepository<PedidoItem, PedidoItemPK> {
}

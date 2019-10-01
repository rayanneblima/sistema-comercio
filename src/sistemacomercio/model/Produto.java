/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacomercio.model;

import java.util.Date;

/**
 *
 * @author vhviv
 */
public class Produto implements Model {

        private int id;
        private String nome;
        private float custoCompra;
        private float valorVenda;
        private Date validade;
        private int qtd;
        private String desc;

        @Override
        public int getId() {
                return id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public float getCustoCompra() {
                return custoCompra;
        }

        public void setCustoCompra(float custoCompra) {
                this.custoCompra = custoCompra;
        }

        public float getValorVenda() {
                return valorVenda;
        }

        public void setValorVenda(float valorVenda) {
                this.valorVenda = valorVenda;
        }

        public Date getValidade() {
                return validade;
        }

        public void setValidade(Date validade) {
                this.validade = validade;
        }

        public int getQtd() {
                return qtd;
        }

        public void setQtd(int qtd) {
                this.qtd = qtd;
        }

        public String getDesc() {
                return desc;
        }

        public void setDesc(String desc) {
                this.desc = desc;
        }
}

package com.example.kafka;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DomainList {

  List<Domain> domains = new ArrayList<>();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DomainList that = (DomainList) o;
    return Objects.equals(domains, that.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains);
  }

  public List<Domain> getDomains() {
    return domains;
  }

  public void setDomains(List<Domain> domains) {
    this.domains = domains;
  }

  public DomainList() {
  }

  public DomainList(List<Domain> domains) {
    this.domains = domains;
  }
}

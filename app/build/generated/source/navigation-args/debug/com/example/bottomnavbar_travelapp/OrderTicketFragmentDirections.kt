package com.example.bottomnavbar_travelapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class OrderTicketFragmentDirections private constructor() {
  public companion object {
    public fun actionOrderTicketFragmentToSelectTicketFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderTicketFragment_to_selectTicketFragment)
  }
}

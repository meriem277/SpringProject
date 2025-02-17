import { Pipe, PipeTransform } from '@angular/core';
import { Residence } from '../core/models/residence';

@Pipe({ name: 'filterByAddress' })
export class FilterByAddressPipe implements PipeTransform {
  transform(residences: Residence[], searchQuery: string): Residence[] {
    if (!searchQuery) return residences;
    return residences.filter(residence =>
      residence.address.toLowerCase().includes(searchQuery.toLowerCase())
    );
  }
}
